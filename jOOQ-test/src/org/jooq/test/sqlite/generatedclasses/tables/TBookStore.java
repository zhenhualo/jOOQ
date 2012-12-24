/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlite.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class TBookStore extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.sqlite.generatedclasses.tables.records.TBookStoreRecord> {

	private static final long serialVersionUID = -823260076;

	/**
	 * The singleton instance of <code>t_book_store</code>
	 */
	public static final org.jooq.test.sqlite.generatedclasses.tables.TBookStore T_BOOK_STORE = new org.jooq.test.sqlite.generatedclasses.tables.TBookStore();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.sqlite.generatedclasses.tables.records.TBookStoreRecord> getRecordType() {
		return org.jooq.test.sqlite.generatedclasses.tables.records.TBookStoreRecord.class;
	}

	/**
	 * The column <code>t_book_store.name</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.TBookStoreRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(400), T_BOOK_STORE);

	/**
	 * No further instances allowed
	 */
	private TBookStore() {
		super("t_book_store");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.TBookStoreRecord> getMainKey() {
		return org.jooq.test.sqlite.generatedclasses.Keys.PK_T_BOOK_STORE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.TBookStoreRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.TBookStoreRecord>>asList(org.jooq.test.sqlite.generatedclasses.Keys.PK_T_BOOK_STORE_NAME);
	}
}
