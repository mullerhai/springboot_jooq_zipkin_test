/**
 * This class is generated by jOOQ
 */
package com.grb.indonesia.entity.tables.records;


import com.grb.indonesia.entity.tables.TestDate;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TestDateRecord extends TableRecordImpl<TestDateRecord> implements Record2<Long, Timestamp> {

    private static final long serialVersionUID = -299733600;

    /**
     * Setter for <code>pinpoint.test_date.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pinpoint.test_date.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pinpoint.test_date.dt</code>.
     */
    public void setDt(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>pinpoint.test_date.dt</code>.
     */
    public Timestamp getDt() {
        return (Timestamp) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Long, Timestamp> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Long, Timestamp> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return TestDate.TEST_DATE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return TestDate.TEST_DATE.DT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value2() {
        return getDt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestDateRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestDateRecord value2(Timestamp value) {
        setDt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestDateRecord values(Long value1, Timestamp value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TestDateRecord
     */
    public TestDateRecord() {
        super(TestDate.TEST_DATE);
    }

    /**
     * Create a detached, initialised TestDateRecord
     */
    public TestDateRecord(Long id, Timestamp dt) {
        super(TestDate.TEST_DATE);

        set(0, id);
        set(1, dt);
    }
}
