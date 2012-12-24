/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlite.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class XTestCase_85 extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_85Record> {

	private static final long serialVersionUID = 1078570612;

	/**
	 * The singleton instance of <code>x_test_case_85</code>
	 */
	public static final org.jooq.test.sqlite.generatedclasses.tables.XTestCase_85 X_TEST_CASE_85 = new org.jooq.test.sqlite.generatedclasses.tables.XTestCase_85();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_85Record> getRecordType() {
		return org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_85Record.class;
	}

	/**
	 * The column <code>x_test_case_85.id</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_85Record, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, X_TEST_CASE_85);

	/**
	 * The column <code>x_test_case_85.x_unused_id</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_85Record, java.lang.Integer> X_UNUSED_ID = createField("x_unused_id", org.jooq.impl.SQLDataType.INTEGER, X_TEST_CASE_85);

	/**
	 * The column <code>x_test_case_85.x_unused_name</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_85Record, java.lang.String> X_UNUSED_NAME = createField("x_unused_name", org.jooq.impl.SQLDataType.VARCHAR.length(10), X_TEST_CASE_85);

	/**
	 * No further instances allowed
	 */
	private XTestCase_85() {
		super("x_test_case_85");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_85Record> getMainKey() {
		return org.jooq.test.sqlite.generatedclasses.Keys.PK_X_TEST_CASE_85_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_85Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_85Record>>asList(org.jooq.test.sqlite.generatedclasses.Keys.PK_X_TEST_CASE_85_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_85Record, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_85Record, ?>>asList(org.jooq.test.sqlite.generatedclasses.Keys.FK_X_TEST_CASE_85_X_UNUSED_1);
	}
}
