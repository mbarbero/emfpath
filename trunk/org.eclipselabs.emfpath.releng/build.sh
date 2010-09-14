#!/bin/bash

function usage {
	echo "build.sh VERSION"
	echo "Example: build.sh 0.5.1"
}

function replace {
	FILE=$1
	FROM=$2
	TO=$3
	sed -i "s/$FROM/$TO/g" $FILE
}

if [ $# -lt 1 ]; then
	usage
	exit 5
fi

VERSION=$1
RELEASE_NAME=emfpath-r$1
RELEASE_TAG=release$1
ZIP_FILE=build/$RELEASE_NAME.zip

echo -n "Building OSGi bundle of $RELEASE_NAME..."

rm -rf $RELEASE_NAME
mkdir $RELEASE_NAME

cp -Rf templates/* $RELEASE_NAME
find $RELEASE_NAME/ -name .svn  | xargs rm -rf

unzip -qq -o $ZIP_FILE -d /tmp
unzip -qq -o /tmp/$RELEASE_NAME/emfpath-r$1.jar -d /tmp/$RELEASE_NAME/bin
unzip -qq -o /tmp/$RELEASE_NAME/emfpath-src-r$1.zip -d /tmp/$RELEASE_NAME/src

cp -Rf /tmp/$RELEASE_NAME/bin/org $RELEASE_NAME/org.eclipselabs.emfpath/
cp -Rf /tmp/$RELEASE_NAME/bin/META-INF $RELEASE_NAME/org.eclipselabs.emfpath/
cp -Rf /tmp/$RELEASE_NAME/bin/OSGI-INF $RELEASE_NAME/org.eclipselabs.emfpath/

cp -Rf /tmp/$RELEASE_NAME/src/api/* $RELEASE_NAME/org.eclipselabs.emfpath.source/
cp -Rf /tmp/$RELEASE_NAME/src/emf-indie/* $RELEASE_NAME/org.eclipselabs.emfpath.source/
cp -Rf /tmp/$RELEASE_NAME/src/internal/* $RELEASE_NAME/org.eclipselabs.emfpath.source/
cp -Rf /tmp/$RELEASE_NAME/bin/META-INF $RELEASE_NAME/org.eclipselabs.emfpath.source/
cp -Rf /tmp/$RELEASE_NAME/bin/OSGI-INF $RELEASE_NAME/org.eclipselabs.emfpath.source/

cp -Rf /tmp/$RELEASE_NAME/javadoc $RELEASE_NAME/org.eclipselabs.emfpath.source/

cp /tmp/$RELEASE_NAME/about.html $RELEASE_NAME/org.eclipselabs.emfpath.source/about_files

replace $RELEASE_NAME/org.eclipselabs.emfpath.source/META-INF/MANIFEST.MF "Bundle-SymbolicName: org.eclipselabs.emfpath" "Bundle-SymbolicName: org.eclipselabs.emfpath.source"
sed -i '/^\s*$/d' $RELEASE_NAME/org.eclipselabs.emfpath.source/META-INF/MANIFEST.MF
echo "Eclipse-SourceBundle: org.eclipselabs.emfpath;version=$VERSION" >> $RELEASE_NAME/org.eclipselabs.emfpath.source/META-INF/MANIFEST.MF
echo "" >> $RELEASE_NAME/org.eclipselabs.emfpath.source/META-INF/MANIFEST.MF

replace $RELEASE_NAME/org.eclipselabs.emfpath.runtime.feature/feature.xml "#VERSION#" $VERSION
replace $RELEASE_NAME/org.eclipselabs.emfpath.runtime.feature/feature.xml "#RELEASE_TAG#" $RELEASE_TAG
replace $RELEASE_NAME/org.eclipselabs.emfpath.sdk.feature/feature.xml "#VERSION#" $VERSION
replace $RELEASE_NAME/org.eclipselabs.emfpath.sdk.feature/feature.xml "#RELEASE_TAG#" $RELEASE_TAG

rm -rf /tmp/$RELEASE_NAME

jar -cmf $RELEASE_NAME/org.eclipselabs.emfpath/META-INF/MANIFEST.MF build/repository/plugins/org.eclipselabs.emfpath_$VERSION.jar -C $RELEASE_NAME/org.eclipselabs.emfpath .
jar -cmf $RELEASE_NAME/org.eclipselabs.emfpath.source/META-INF/MANIFEST.MF build/repository/plugins/org.eclipselabs.emfpath.source_$VERSION.jar -C $RELEASE_NAME/org.eclipselabs.emfpath.source .

cp -Rf $RELEASE_NAME/org.eclipselabs.emfpath.runtime.feature build/repository/features/org.eclipselabs.emfpath.runtime.feature_$VERSION
cp -Rf $RELEASE_NAME/org.eclipselabs.emfpath.sdk.feature build/repository/features/org.eclipselabs.emfpath.sdk.feature_$VERSION

rm -rf $RELEASE_NAME

echo ""
