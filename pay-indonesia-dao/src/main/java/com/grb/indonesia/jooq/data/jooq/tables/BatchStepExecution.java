/**
 * This class is generated by jOOQ
 */
package com.grb.indonesia.jooq.data.jooq.tables;


import com.grb.indonesia.jooq.data.jooq.Keys;
import com.grb.indonesia.jooq.data.jooq.Pinpoint;
import com.grb.indonesia.jooq.data.jooq.tables.records.BatchStepExecutionRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class BatchStepExecution extends TableImpl<BatchStepExecutionRecord> {

    private static final long serialVersionUID = -2058021548;

    /**
     * The reference instance of <code>pinpoint.BATCH_STEP_EXECUTION</code>
     */
    public static final BatchStepExecution BATCH_STEP_EXECUTION = new BatchStepExecution();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BatchStepExecutionRecord> getRecordType() {
        return BatchStepExecutionRecord.class;
    }

    /**
     * The column <code>pinpoint.BATCH_STEP_EXECUTION.STEP_EXECUTION_ID</code>.
     */
    public final TableField<BatchStepExecutionRecord, Long> STEP_EXECUTION_ID = createField("STEP_EXECUTION_ID", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pinpoint.BATCH_STEP_EXECUTION.VERSION</code>.
     */
    public final TableField<BatchStepExecutionRecord, Long> VERSION = createField("VERSION", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pinpoint.BATCH_STEP_EXECUTION.STEP_NAME</code>.
     */
    public final TableField<BatchStepExecutionRecord, String> STEP_NAME = createField("STEP_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

    /**
     * The column <code>pinpoint.BATCH_STEP_EXECUTION.JOB_EXECUTION_ID</code>.
     */
    public final TableField<BatchStepExecutionRecord, Long> JOB_EXECUTION_ID = createField("JOB_EXECUTION_ID", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pinpoint.BATCH_STEP_EXECUTION.START_TIME</code>.
     */
    public final TableField<BatchStepExecutionRecord, Timestamp> START_TIME = createField("START_TIME", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>pinpoint.BATCH_STEP_EXECUTION.END_TIME</code>.
     */
    public final TableField<BatchStepExecutionRecord, Timestamp> END_TIME = createField("END_TIME", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>pinpoint.BATCH_STEP_EXECUTION.STATUS</code>.
     */
    public final TableField<BatchStepExecutionRecord, String> STATUS = createField("STATUS", org.jooq.impl.SQLDataType.VARCHAR.length(10), this, "");

    /**
     * The column <code>pinpoint.BATCH_STEP_EXECUTION.COMMIT_COUNT</code>.
     */
    public final TableField<BatchStepExecutionRecord, Long> COMMIT_COUNT = createField("COMMIT_COUNT", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pinpoint.BATCH_STEP_EXECUTION.READ_COUNT</code>.
     */
    public final TableField<BatchStepExecutionRecord, Long> READ_COUNT = createField("READ_COUNT", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pinpoint.BATCH_STEP_EXECUTION.FILTER_COUNT</code>.
     */
    public final TableField<BatchStepExecutionRecord, Long> FILTER_COUNT = createField("FILTER_COUNT", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pinpoint.BATCH_STEP_EXECUTION.WRITE_COUNT</code>.
     */
    public final TableField<BatchStepExecutionRecord, Long> WRITE_COUNT = createField("WRITE_COUNT", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pinpoint.BATCH_STEP_EXECUTION.READ_SKIP_COUNT</code>.
     */
    public final TableField<BatchStepExecutionRecord, Long> READ_SKIP_COUNT = createField("READ_SKIP_COUNT", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pinpoint.BATCH_STEP_EXECUTION.WRITE_SKIP_COUNT</code>.
     */
    public final TableField<BatchStepExecutionRecord, Long> WRITE_SKIP_COUNT = createField("WRITE_SKIP_COUNT", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pinpoint.BATCH_STEP_EXECUTION.PROCESS_SKIP_COUNT</code>.
     */
    public final TableField<BatchStepExecutionRecord, Long> PROCESS_SKIP_COUNT = createField("PROCESS_SKIP_COUNT", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pinpoint.BATCH_STEP_EXECUTION.ROLLBACK_COUNT</code>.
     */
    public final TableField<BatchStepExecutionRecord, Long> ROLLBACK_COUNT = createField("ROLLBACK_COUNT", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pinpoint.BATCH_STEP_EXECUTION.EXIT_CODE</code>.
     */
    public final TableField<BatchStepExecutionRecord, String> EXIT_CODE = createField("EXIT_CODE", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

    /**
     * The column <code>pinpoint.BATCH_STEP_EXECUTION.EXIT_MESSAGE</code>.
     */
    public final TableField<BatchStepExecutionRecord, String> EXIT_MESSAGE = createField("EXIT_MESSAGE", org.jooq.impl.SQLDataType.VARCHAR.length(2500), this, "");

    /**
     * The column <code>pinpoint.BATCH_STEP_EXECUTION.LAST_UPDATED</code>.
     */
    public final TableField<BatchStepExecutionRecord, Timestamp> LAST_UPDATED = createField("LAST_UPDATED", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>pinpoint.BATCH_STEP_EXECUTION</code> table reference
     */
    public BatchStepExecution() {
        this("BATCH_STEP_EXECUTION", null);
    }

    /**
     * Create an aliased <code>pinpoint.BATCH_STEP_EXECUTION</code> table reference
     */
    public BatchStepExecution(String alias) {
        this(alias, BATCH_STEP_EXECUTION);
    }

    private BatchStepExecution(String alias, Table<BatchStepExecutionRecord> aliased) {
        this(alias, aliased, null);
    }

    private BatchStepExecution(String alias, Table<BatchStepExecutionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Pinpoint.PINPOINT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<BatchStepExecutionRecord> getPrimaryKey() {
        return Keys.KEY_BATCH_STEP_EXECUTION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<BatchStepExecutionRecord>> getKeys() {
        return Arrays.<UniqueKey<BatchStepExecutionRecord>>asList(Keys.KEY_BATCH_STEP_EXECUTION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<BatchStepExecutionRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<BatchStepExecutionRecord, ?>>asList(Keys.JOB_EXEC_STEP_FK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BatchStepExecution as(String alias) {
        return new BatchStepExecution(alias, this);
    }

    /**
     * Rename this table
     */
    public BatchStepExecution rename(String name) {
        return new BatchStepExecution(name, null);
    }
}
