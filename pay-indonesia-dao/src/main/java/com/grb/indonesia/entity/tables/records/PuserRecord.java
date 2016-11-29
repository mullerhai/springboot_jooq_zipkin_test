/**
 * This class is generated by jOOQ
 */
package com.grb.indonesia.entity.tables.records;


import com.grb.indonesia.entity.tables.Puser;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class PuserRecord extends UpdatableRecordImpl<PuserRecord> implements Record6<UInteger, String, String, String, String, String> {

    private static final long serialVersionUID = -2127886212;

    /**
     * Setter for <code>pinpoint.puser.number</code>.
     */
    public void setNumber(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>pinpoint.puser.number</code>.
     */
    public UInteger getNumber() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>pinpoint.puser.user_id</code>.
     */
    public void setUserId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pinpoint.puser.user_id</code>.
     */
    public String getUserId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pinpoint.puser.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pinpoint.puser.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pinpoint.puser.department</code>.
     */
    public void setDepartment(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>pinpoint.puser.department</code>.
     */
    public String getDepartment() {
        return (String) get(3);
    }

    /**
     * Setter for <code>pinpoint.puser.phonenumber</code>.
     */
    public void setPhonenumber(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>pinpoint.puser.phonenumber</code>.
     */
    public String getPhonenumber() {
        return (String) get(4);
    }

    /**
     * Setter for <code>pinpoint.puser.email</code>.
     */
    public void setEmail(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>pinpoint.puser.email</code>.
     */
    public String getEmail() {
        return (String) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<UInteger, String, String, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<UInteger, String, String, String, String, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field1() {
        return Puser.PUSER.NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Puser.PUSER.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Puser.PUSER.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Puser.PUSER.DEPARTMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Puser.PUSER.PHONENUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Puser.PUSER.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value1() {
        return getNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getDepartment();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getPhonenumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PuserRecord value1(UInteger value) {
        setNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PuserRecord value2(String value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PuserRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PuserRecord value4(String value) {
        setDepartment(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PuserRecord value5(String value) {
        setPhonenumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PuserRecord value6(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PuserRecord values(UInteger value1, String value2, String value3, String value4, String value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PuserRecord
     */
    public PuserRecord() {
        super(Puser.PUSER);
    }

    /**
     * Create a detached, initialised PuserRecord
     */
    public PuserRecord(UInteger number, String userId, String name, String department, String phonenumber, String email) {
        super(Puser.PUSER);

        set(0, number);
        set(1, userId);
        set(2, name);
        set(3, department);
        set(4, phonenumber);
        set(5, email);
    }
}
