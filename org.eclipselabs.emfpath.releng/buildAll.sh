#!/bin/bash

rm -rf repository/*.jar
rm -rf repository/plugins/*.jar
rm -rf repository/features/*.jar
mkdir -p build/repository/features
mkdir -p build/repository/plugins

./build.sh 0.3.0

EQUINOX_LAUNCHER=eclipse-SDK-3.6-linux-gtk-x86_64/plugins/org.eclipse.equinox.launcher_1.1.0.v20100507.jar
REPOSITORY_LOCATION=file:`pwd`/../org.eclipselabs.emfpath.repositorycontainer/repository

java -jar $EQUINOX_LAUNCHER -application org.eclipse.equinox.p2.publisher.FeaturesAndBundlesPublisher \
   -metadataRepository $REPOSITORY_LOCATION \
   -artifactRepository $REPOSITORY_LOCATION \
   -source build/repository \
   -compress \
   -publishArtifacts

java -jar $EQUINOX_LAUNCHER -application -application org.eclipse.equinox.p2.publisher.CategoryPublisher \
   -metadataRepository $REPOSITORY_LOCATION \
   -categoryDefinition file:/`pwd`/category.xml \
   -compress
