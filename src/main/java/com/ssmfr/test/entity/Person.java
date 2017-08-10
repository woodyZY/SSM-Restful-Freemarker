package com.ssmfr.test.entity;

import java.io.Serializable;

public class Person implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_ssmfr_person.pid
     *
     * @mbggenerated
     */
    private Integer pid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_ssmfr_person.pname
     *
     * @mbggenerated
     */
    private String pname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_ssmfr_person
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ssmfr_person.pid
     *
     * @return the value of t_ssmfr_person.pid
     *
     * @mbggenerated
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ssmfr_person.pid
     *
     * @param pid the value for t_ssmfr_person.pid
     *
     * @mbggenerated
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ssmfr_person.pname
     *
     * @return the value of t_ssmfr_person.pname
     *
     * @mbggenerated
     */
    public String getPname() {
        return pname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ssmfr_person.pname
     *
     * @param pname the value for t_ssmfr_person.pname
     *
     * @mbggenerated
     */
    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ssmfr_person
     *
     * @mbggenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Person other = (Person) that;
        return (this.getPid() == null ? other.getPid() == null : this.getPid().equals(other.getPid()))
            && (this.getPname() == null ? other.getPname() == null : this.getPname().equals(other.getPname()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ssmfr_person
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPid() == null) ? 0 : getPid().hashCode());
        result = prime * result + ((getPname() == null) ? 0 : getPname().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ssmfr_person
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pid=").append(pid);
        sb.append(", pname=").append(pname);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}