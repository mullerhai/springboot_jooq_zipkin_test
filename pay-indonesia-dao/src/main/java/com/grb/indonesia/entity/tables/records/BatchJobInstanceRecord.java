/**
 * This class is generated by jOOQ
 */
package com.grb.indonesia.entity.tables.records;


import com.grb.indonesia.entity.tables.BatchJobInstance;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


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
public class BatchJobInstanceRecord extends UpdatableRecordImpl<BatchJobInstanceRecord> implements Record4<Long, Long, String, String> {

    private static final long serialVersionUID = -467669188;

    /**
     * Setter for <code>pinpoint.BATCH_JOB_INSTANCE.JOB_INSTANCE_ID</code>.
     */
    public void setJobInstanceId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pinpoint.BATCH_JOB_INSTANCE.JOB_INSTANCE_ID</code>.
     */
    public Long getJobInstanceId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pinpoint.BATCH_JOB_INSTANCE.VERSION</code>.
     */
    public void setVersion(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pinpoint.BATCH_JOB_INSTANCE.VERSION</code>.
     */
    public Long getVersion() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pinpoint.BATCH_JOB_INSTANCE.JOB_NAME</code>.
     */
    public void setJobName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pinpoint.BATCH_JOB_INSTANCE.JOB_NAME</code>.
     */
    public String getJobName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pinpoint.BATCH_JOB_INSTANCE.JOB_KEY</code>.
     */
    public void setJobKey(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>pinpoint.BATCH_JOB_INSTANCE.JOB_KEY</code>.
     */
    public String getJobKey() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, Long, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, Long, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return BatchJobInstance.BATCH_JOB_INSTANCE.JOB_INSTANCE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return BatchJobInstance.BATCH_JOB_INSTANCE.VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return BatchJobInstance.BATCH_JOB_INSTANCE.JOB_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return BatchJobInstance.BATCH_JOB_INSTANCE.JOB_KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getJobInstanceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getJobName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getJobKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BatchJobInstanceRecord value1(Long value) {
        setJobInstanceId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BatchJobInstanceRecord value2(Long value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BatchJobInstanceRecord value3(String value) {
        setJobName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BatchJobInstanceRecord value4(String value) {
        setJobKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BatchJobInstanceRecord values(Long value1, Long value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BatchJobInstanceRecord
     */
    public BatchJobInstanceRecord() {
        super(BatchJobInstance.BATCH_JOB_INSTANCE);
    }

    /**
     * Create a detached, initialised BatchJobInstanceRecord
     */
    public BatchJobInstanceRecord(Long jobInstanceId, Long version, String jobName, String jobKey) {
        super(BatchJobInstance.BATCH_JOB_INSTANCE);

        set(0, jobInstanceId);
        set(1, version);
        set(2, jobName);
        set(3, jobKey);
    }
}
