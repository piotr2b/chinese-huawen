/**
 * This class is generated by jOOQ
 */
package com.piotr2b.chinesehuawen.entities;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Huawen extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = 100660773;

	/**
	 * The singleton instance of <code>huawen</code>
	 */
	public static final Huawen HUAWEN = new Huawen();

	/**
	 * No further instances allowed
	 */
	private Huawen() {
		super("huawen");
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		java.util.List result = new java.util.ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final java.util.List<org.jooq.Table<?>> getTables0() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			com.piotr2b.chinesehuawen.entities.tables.Allography.ALLOGRAPHY,
			com.piotr2b.chinesehuawen.entities.tables.Sinogram.SINOGRAM,
			com.piotr2b.chinesehuawen.entities.tables.Structure.STRUCTURE);
	}
}
