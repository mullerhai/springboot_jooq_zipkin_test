/**
 * This class is generated by jOOQ
 */
package com.grb.indonesia.entity.tables.records;


import com.grb.indonesia.entity.tables.BatchStepExecutionSeq;

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
public class BatchStepExecutionSeqRecord extends TableRecordImpl<BatchStepExecutionSeqRecord> implements Record2<Long, String> {

    private static final long serialVersionUID = -1539584338;

    /**
     * Setter for <code>pinpoint.BATCH_STEP_EXECUTION_SEQ.ID</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pinpoint.BATCH_STEP_EXECUTION_SEQ.ID</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pinpoint.BATCH_STEP_EXECUTION_SEQ.UNIQUE_KEY</code>.
     */
    public void setUniqueKey(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pinpoint.BATCH_STEP_EXECUTION_SEQ.UNIQUE_KEY</code>.
     */
    public String getUniqueKey() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Long, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Long, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return BatchStepExecutionSeq.BATCH_STEP_EXECUTION_SEQ.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return BatchStepExecutionSeq.BATCH_STEP_EXECUTION_SEQ.UNIQUE_KEY;
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
    public String value2() {
        return getUniqueKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BatchStepExecutionSeqRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BatchStepExecutionSeqRecord value2(String value) {
        setUniqueKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BatchStepExecutionSeqRecord values(Long value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BatchStepExecutionSeqRecord
     */
    public BatchStepExecutionSeqRecord() {
        super(BatchStepExecutionSeq.BATCH_STEP_EXECUTION_SEQ);
    }

    /**
     * Create a detached, initialised BatchStepExecutionSeqRecord
     */
    public BatchStepExecutionSeqRecord(Long id, String uniqueKey) {
        super(BatchStepExecutionSeq.BATCH_STEP_EXECUTION_SEQ);

        set(0, id);
        set(1, uniqueKey);
    }
}
