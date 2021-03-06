/**
 * This class is generated by jOOQ
 */
package com.grb.indonesia.jooq.data.jooq;


import com.grb.indonesia.jooq.data.jooq.tables.AlarmHistory;
import com.grb.indonesia.jooq.data.jooq.tables.AlarmRule;
import com.grb.indonesia.jooq.data.jooq.tables.BatchJobExecution;
import com.grb.indonesia.jooq.data.jooq.tables.BatchJobExecutionContext;
import com.grb.indonesia.jooq.data.jooq.tables.BatchJobExecutionParams;
import com.grb.indonesia.jooq.data.jooq.tables.BatchJobExecutionSeq;
import com.grb.indonesia.jooq.data.jooq.tables.BatchJobInstance;
import com.grb.indonesia.jooq.data.jooq.tables.BatchJobSeq;
import com.grb.indonesia.jooq.data.jooq.tables.BatchStepExecution;
import com.grb.indonesia.jooq.data.jooq.tables.BatchStepExecutionContext;
import com.grb.indonesia.jooq.data.jooq.tables.BatchStepExecutionSeq;
import com.grb.indonesia.jooq.data.jooq.tables.Puser;
import com.grb.indonesia.jooq.data.jooq.tables.TestDate;
import com.grb.indonesia.jooq.data.jooq.tables.UserGroup;
import com.grb.indonesia.jooq.data.jooq.tables.UserGroupMember;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class Pinpoint extends SchemaImpl {

    private static final long serialVersionUID = -413330384;

    /**
     * The reference instance of <code>pinpoint</code>
     */
    public static final Pinpoint PINPOINT = new Pinpoint();

    /**
     * The table <code>pinpoint.alarm_history</code>.
     */
    public final AlarmHistory ALARM_HISTORY = com.grb.indonesia.jooq.data.jooq.tables.AlarmHistory.ALARM_HISTORY;

    /**
     * The table <code>pinpoint.alarm_rule</code>.
     */
    public final AlarmRule ALARM_RULE = com.grb.indonesia.jooq.data.jooq.tables.AlarmRule.ALARM_RULE;

    /**
     * The table <code>pinpoint.BATCH_JOB_EXECUTION</code>.
     */
    public final BatchJobExecution BATCH_JOB_EXECUTION = com.grb.indonesia.jooq.data.jooq.tables.BatchJobExecution.BATCH_JOB_EXECUTION;

    /**
     * The table <code>pinpoint.BATCH_JOB_EXECUTION_CONTEXT</code>.
     */
    public final BatchJobExecutionContext BATCH_JOB_EXECUTION_CONTEXT = com.grb.indonesia.jooq.data.jooq.tables.BatchJobExecutionContext.BATCH_JOB_EXECUTION_CONTEXT;

    /**
     * The table <code>pinpoint.BATCH_JOB_EXECUTION_PARAMS</code>.
     */
    public final BatchJobExecutionParams BATCH_JOB_EXECUTION_PARAMS = com.grb.indonesia.jooq.data.jooq.tables.BatchJobExecutionParams.BATCH_JOB_EXECUTION_PARAMS;

    /**
     * The table <code>pinpoint.BATCH_JOB_EXECUTION_SEQ</code>.
     */
    public final BatchJobExecutionSeq BATCH_JOB_EXECUTION_SEQ = com.grb.indonesia.jooq.data.jooq.tables.BatchJobExecutionSeq.BATCH_JOB_EXECUTION_SEQ;

    /**
     * The table <code>pinpoint.BATCH_JOB_INSTANCE</code>.
     */
    public final BatchJobInstance BATCH_JOB_INSTANCE = com.grb.indonesia.jooq.data.jooq.tables.BatchJobInstance.BATCH_JOB_INSTANCE;

    /**
     * The table <code>pinpoint.BATCH_JOB_SEQ</code>.
     */
    public final BatchJobSeq BATCH_JOB_SEQ = com.grb.indonesia.jooq.data.jooq.tables.BatchJobSeq.BATCH_JOB_SEQ;

    /**
     * The table <code>pinpoint.BATCH_STEP_EXECUTION</code>.
     */
    public final BatchStepExecution BATCH_STEP_EXECUTION = com.grb.indonesia.jooq.data.jooq.tables.BatchStepExecution.BATCH_STEP_EXECUTION;

    /**
     * The table <code>pinpoint.BATCH_STEP_EXECUTION_CONTEXT</code>.
     */
    public final BatchStepExecutionContext BATCH_STEP_EXECUTION_CONTEXT = com.grb.indonesia.jooq.data.jooq.tables.BatchStepExecutionContext.BATCH_STEP_EXECUTION_CONTEXT;

    /**
     * The table <code>pinpoint.BATCH_STEP_EXECUTION_SEQ</code>.
     */
    public final BatchStepExecutionSeq BATCH_STEP_EXECUTION_SEQ = com.grb.indonesia.jooq.data.jooq.tables.BatchStepExecutionSeq.BATCH_STEP_EXECUTION_SEQ;

    /**
     * The table <code>pinpoint.puser</code>.
     */
    public final Puser PUSER = com.grb.indonesia.jooq.data.jooq.tables.Puser.PUSER;

    /**
     * The table <code>pinpoint.test_date</code>.
     */
    public final TestDate TEST_DATE = com.grb.indonesia.jooq.data.jooq.tables.TestDate.TEST_DATE;

    /**
     * The table <code>pinpoint.user_group</code>.
     */
    public final UserGroup USER_GROUP = com.grb.indonesia.jooq.data.jooq.tables.UserGroup.USER_GROUP;

    /**
     * The table <code>pinpoint.user_group_member</code>.
     */
    public final UserGroupMember USER_GROUP_MEMBER = com.grb.indonesia.jooq.data.jooq.tables.UserGroupMember.USER_GROUP_MEMBER;

    /**
     * No further instances allowed
     */
    private Pinpoint() {
        super("pinpoint", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            AlarmHistory.ALARM_HISTORY,
            AlarmRule.ALARM_RULE,
            BatchJobExecution.BATCH_JOB_EXECUTION,
            BatchJobExecutionContext.BATCH_JOB_EXECUTION_CONTEXT,
            BatchJobExecutionParams.BATCH_JOB_EXECUTION_PARAMS,
            BatchJobExecutionSeq.BATCH_JOB_EXECUTION_SEQ,
            BatchJobInstance.BATCH_JOB_INSTANCE,
            BatchJobSeq.BATCH_JOB_SEQ,
            BatchStepExecution.BATCH_STEP_EXECUTION,
            BatchStepExecutionContext.BATCH_STEP_EXECUTION_CONTEXT,
            BatchStepExecutionSeq.BATCH_STEP_EXECUTION_SEQ,
            Puser.PUSER,
            TestDate.TEST_DATE,
            UserGroup.USER_GROUP,
            UserGroupMember.USER_GROUP_MEMBER);
    }
}
