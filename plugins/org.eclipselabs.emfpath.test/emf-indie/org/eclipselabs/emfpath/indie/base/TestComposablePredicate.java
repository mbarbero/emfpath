package org.eclipselabs.emfpath.indie.base;

import org.eclipselabs.emfpath.indie.util.ComposablePredicate;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël Barbero</a>
 */
public class TestComposablePredicate {

	private static Object mock;

	private static ComposablePredicate<Object> t1;
	private static ComposablePredicate<Object> t2;
	private static ComposablePredicate<Object> t3;

	private static ComposablePredicate<Object> f1;
	private static ComposablePredicate<Object> f2;
	private static ComposablePredicate<Object> f3;

	private ComposablePredicate<Object> composed;

	@BeforeClass
	public static void init() {
		TestComposablePredicate.mock = new Object();

		TestComposablePredicate.t1 = new AlwaysTrueComposablePredicate();
		TestComposablePredicate.t2 = new AlwaysTrueComposablePredicate();
		TestComposablePredicate.t3 = new AlwaysTrueComposablePredicate();

		TestComposablePredicate.f1 = new AlwaysFalseComposablePredicate();
		TestComposablePredicate.f2 = new AlwaysFalseComposablePredicate();
		TestComposablePredicate.f3 = new AlwaysFalseComposablePredicate();
	}

	@Before
	public void before() {
		this.composed = null;
	}

	@Test
	public void testAndTrue1() {
		this.composed = TestComposablePredicate.t1.and(TestComposablePredicate.t2);
		Assert.assertTrue(this.composed.apply(TestComposablePredicate.mock));
	}

	@Test
	public void testAndTrue2() {
		this.composed = TestComposablePredicate.t1.and(TestComposablePredicate.t2).and(TestComposablePredicate.t3);
		Assert.assertTrue(this.composed.apply(TestComposablePredicate.mock));
	}

	@Test
	public void testAndFalse1() {
		this.composed = TestComposablePredicate.t1.and(TestComposablePredicate.f2);
		Assert.assertFalse(this.composed.apply(TestComposablePredicate.mock));
	}

	@Test
	public void testAndFalse2() {
		this.composed = TestComposablePredicate.f1.and(TestComposablePredicate.t2);
		Assert.assertFalse(this.composed.apply(TestComposablePredicate.mock));
	}

	@Test
	public void testAndFalse3() {
		this.composed = TestComposablePredicate.f1.and(TestComposablePredicate.f2);
		Assert.assertFalse(this.composed.apply(TestComposablePredicate.mock));
	}

	@Test
	public void testAndFalse4() {
		this.composed = TestComposablePredicate.t1.and(TestComposablePredicate.t2).and(TestComposablePredicate.f3);
		Assert.assertFalse(this.composed.apply(TestComposablePredicate.mock));
	}

	@Test
	public void testOrTrue1() {
		this.composed = TestComposablePredicate.t1.or(TestComposablePredicate.t2);
		Assert.assertTrue(this.composed.apply(TestComposablePredicate.mock));
	}

	@Test
	public void testOrTrue2() {
		this.composed = TestComposablePredicate.t1.or(TestComposablePredicate.f2);
		Assert.assertTrue(this.composed.apply(TestComposablePredicate.mock));
	}

	@Test
	public void testOrTrue3() {
		this.composed = TestComposablePredicate.f1.or(TestComposablePredicate.t2);
		Assert.assertTrue(this.composed.apply(TestComposablePredicate.mock));
	}

	@Test
	public void testOrTrue4() {
		this.composed = TestComposablePredicate.f1.or(TestComposablePredicate.t2).or(TestComposablePredicate.t3);
		Assert.assertTrue(this.composed.apply(TestComposablePredicate.mock));
	}

	@Test
	public void testOrTrue5() {
		this.composed = TestComposablePredicate.f1.or(TestComposablePredicate.f2).or(TestComposablePredicate.t3);
		Assert.assertTrue(this.composed.apply(TestComposablePredicate.mock));
	}

	@Test
	public void testOrFalse1() {
		this.composed = TestComposablePredicate.f1.or(TestComposablePredicate.f2);
		Assert.assertFalse(this.composed.apply(TestComposablePredicate.mock));
	}

	@Test
	public void testOrFalse2() {
		this.composed = TestComposablePredicate.f1.or(TestComposablePredicate.f2).or(TestComposablePredicate.f3);
		Assert.assertFalse(this.composed.apply(TestComposablePredicate.mock));
	}

	@Test
	public void testXorTrue1() {
		this.composed = TestComposablePredicate.t1.xor(TestComposablePredicate.f2);
		Assert.assertTrue(this.composed.apply(TestComposablePredicate.mock));
	}

	@Test
	public void testXorTrue2() {
		this.composed = TestComposablePredicate.f1.xor(TestComposablePredicate.t1);
		Assert.assertTrue(this.composed.apply(TestComposablePredicate.mock));
	}

	@Test
	public void testXorTrue3() {
		this.composed = TestComposablePredicate.t1.xor(TestComposablePredicate.f2).xor(TestComposablePredicate.f3);
		Assert.assertTrue(this.composed.apply(TestComposablePredicate.mock));
	}

	@Test
	public void testXorTrue4() {
		this.composed = TestComposablePredicate.f1.xor(TestComposablePredicate.t2).xor(TestComposablePredicate.f3);
		Assert.assertTrue(this.composed.apply(TestComposablePredicate.mock));
	}

	@Test
	public void testXorTrue5() {
		this.composed = TestComposablePredicate.f1.xor(TestComposablePredicate.f2).xor(TestComposablePredicate.t3);
		Assert.assertTrue(this.composed.apply(TestComposablePredicate.mock));
	}

	@Test
	public void testXorTrue6() {
		this.composed = TestComposablePredicate.t1.xor(TestComposablePredicate.t2).xor(TestComposablePredicate.t3);
		Assert.assertTrue(this.composed.apply(TestComposablePredicate.mock));
	}

	@Test
	public void testXorFalse1() {
		this.composed = TestComposablePredicate.t1.xor(TestComposablePredicate.t2);
		Assert.assertFalse(this.composed.apply(TestComposablePredicate.mock));
	}

	@Test
	public void testXorFalse2() {
		this.composed = TestComposablePredicate.f1.xor(TestComposablePredicate.f2);
		Assert.assertFalse(this.composed.apply(TestComposablePredicate.mock));
	}

	@Test
	public void testXorFalse3() {
		this.composed = TestComposablePredicate.t1.xor(TestComposablePredicate.t2).xor(TestComposablePredicate.f3);
		Assert.assertFalse(this.composed.apply(TestComposablePredicate.mock));
	}

	@Test
	public void testXorFalse4() {
		this.composed = TestComposablePredicate.f1.xor(TestComposablePredicate.t1).xor(TestComposablePredicate.t2);
		Assert.assertFalse(this.composed.apply(TestComposablePredicate.mock));
	}

	@Test
	public void testXorFalse5() {
		this.composed = TestComposablePredicate.t1.xor(TestComposablePredicate.f2).xor(TestComposablePredicate.t3);
		Assert.assertFalse(this.composed.apply(TestComposablePredicate.mock));
	}

	@Test
	public void testXorFalse6() {
		this.composed = TestComposablePredicate.f1.xor(TestComposablePredicate.f2).xor(TestComposablePredicate.f3);
		Assert.assertFalse(this.composed.apply(TestComposablePredicate.mock));
	}

	@Test
	public void testNegate1() {
		Assert.assertFalse(TestComposablePredicate.t1.negate().apply(TestComposablePredicate.mock));
	}

	@Test
	public void testNegate2() {
		Assert.assertTrue(TestComposablePredicate.f1.negate().apply(TestComposablePredicate.mock));
	}

	static class AlwaysTrueComposablePredicate extends ComposablePredicate<Object> {
		public boolean apply(Object input) {
			return true;
		}
	}

	static class AlwaysFalseComposablePredicate extends ComposablePredicate<Object> {
		public boolean apply(Object input) {
			return false;
		}
	}
}
