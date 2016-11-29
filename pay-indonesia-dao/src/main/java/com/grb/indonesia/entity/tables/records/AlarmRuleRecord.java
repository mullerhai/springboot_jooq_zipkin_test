/**
 * This class is generated by jOOQ
 */
package com.grb.indonesia.entity.tables.records;


import com.grb.indonesia.entity.tables.AlarmRule;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


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
public class AlarmRuleRecord extends UpdatableRecordImpl<AlarmRuleRecord> implements Record9<UInteger, String, String, String, Integer, String, String, String, String> {

    private static final long serialVersionUID = 659001722;

    /**
     * Setter for <code>pinpoint.alarm_rule.rule_id</code>.
     */
    public void setRuleId(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>pinpoint.alarm_rule.rule_id</code>.
     */
    public UInteger getRuleId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>pinpoint.alarm_rule.application_id</code>.
     */
    public void setApplicationId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pinpoint.alarm_rule.application_id</code>.
     */
    public String getApplicationId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pinpoint.alarm_rule.service_type</code>.
     */
    public void setServiceType(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pinpoint.alarm_rule.service_type</code>.
     */
    public String getServiceType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pinpoint.alarm_rule.checker_name</code>.
     */
    public void setCheckerName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>pinpoint.alarm_rule.checker_name</code>.
     */
    public String getCheckerName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>pinpoint.alarm_rule.threshold</code>.
     */
    public void setThreshold(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>pinpoint.alarm_rule.threshold</code>.
     */
    public Integer getThreshold() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>pinpoint.alarm_rule.user_group_id</code>.
     */
    public void setUserGroupId(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>pinpoint.alarm_rule.user_group_id</code>.
     */
    public String getUserGroupId() {
        return (String) get(5);
    }

    /**
     * Setter for <code>pinpoint.alarm_rule.sms_send</code>.
     */
    public void setSmsSend(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>pinpoint.alarm_rule.sms_send</code>.
     */
    public String getSmsSend() {
        return (String) get(6);
    }

    /**
     * Setter for <code>pinpoint.alarm_rule.email_send</code>.
     */
    public void setEmailSend(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>pinpoint.alarm_rule.email_send</code>.
     */
    public String getEmailSend() {
        return (String) get(7);
    }

    /**
     * Setter for <code>pinpoint.alarm_rule.notes</code>.
     */
    public void setNotes(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>pinpoint.alarm_rule.notes</code>.
     */
    public String getNotes() {
        return (String) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<UInteger> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<UInteger, String, String, String, Integer, String, String, String, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<UInteger, String, String, String, Integer, String, String, String, String> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field1() {
        return AlarmRule.ALARM_RULE.RULE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return AlarmRule.ALARM_RULE.APPLICATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return AlarmRule.ALARM_RULE.SERVICE_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return AlarmRule.ALARM_RULE.CHECKER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return AlarmRule.ALARM_RULE.THRESHOLD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return AlarmRule.ALARM_RULE.USER_GROUP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return AlarmRule.ALARM_RULE.SMS_SEND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return AlarmRule.ALARM_RULE.EMAIL_SEND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return AlarmRule.ALARM_RULE.NOTES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value1() {
        return getRuleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getApplicationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getServiceType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getCheckerName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getThreshold();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getUserGroupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getSmsSend();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getEmailSend();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getNotes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AlarmRuleRecord value1(UInteger value) {
        setRuleId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AlarmRuleRecord value2(String value) {
        setApplicationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AlarmRuleRecord value3(String value) {
        setServiceType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AlarmRuleRecord value4(String value) {
        setCheckerName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AlarmRuleRecord value5(Integer value) {
        setThreshold(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AlarmRuleRecord value6(String value) {
        setUserGroupId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AlarmRuleRecord value7(String value) {
        setSmsSend(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AlarmRuleRecord value8(String value) {
        setEmailSend(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AlarmRuleRecord value9(String value) {
        setNotes(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AlarmRuleRecord values(UInteger value1, String value2, String value3, String value4, Integer value5, String value6, String value7, String value8, String value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AlarmRuleRecord
     */
    public AlarmRuleRecord() {
        super(AlarmRule.ALARM_RULE);
    }

    /**
     * Create a detached, initialised AlarmRuleRecord
     */
    public AlarmRuleRecord(UInteger ruleId, String applicationId, String serviceType, String checkerName, Integer threshold, String userGroupId, String smsSend, String emailSend, String notes) {
        super(AlarmRule.ALARM_RULE);

        set(0, ruleId);
        set(1, applicationId);
        set(2, serviceType);
        set(3, checkerName);
        set(4, threshold);
        set(5, userGroupId);
        set(6, smsSend);
        set(7, emailSend);
        set(8, notes);
    }
}
