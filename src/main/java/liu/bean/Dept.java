package liu.bean;

public class Dept {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dept.DEPT_ID
     *
     * @mbggenerated Thu Dec 29 21:08:19 CST 2022
     */
    private Integer deptId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dept.DEPT_NAME
     *
     * @mbggenerated Thu Dec 29 21:08:19 CST 2022
     */
    private String deptName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dept.DEPT_MANAGER
     *
     * @mbggenerated Thu Dec 29 21:08:19 CST 2022
     */
    private Integer deptManager;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dept.DEPT_VICEMANAE
     *
     * @mbggenerated Thu Dec 29 21:08:19 CST 2022
     */
    private Integer deptVicemanae;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dept.DEPT_ID
     *
     * @return the value of dept.DEPT_ID
     *
     * @mbggenerated Thu Dec 29 21:08:19 CST 2022
     */
    public Integer getDeptId() {
        return deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dept.DEPT_ID
     *
     * @param deptId the value for dept.DEPT_ID
     *
     * @mbggenerated Thu Dec 29 21:08:19 CST 2022
     */
    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dept.DEPT_NAME
     *
     * @return the value of dept.DEPT_NAME
     *
     * @mbggenerated Thu Dec 29 21:08:19 CST 2022
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dept.DEPT_NAME
     *
     * @param deptName the value for dept.DEPT_NAME
     *
     * @mbggenerated Thu Dec 29 21:08:19 CST 2022
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dept.DEPT_MANAGER
     *
     * @return the value of dept.DEPT_MANAGER
     *
     * @mbggenerated Thu Dec 29 21:08:19 CST 2022
     */
    public Integer getDeptManager() {
        return deptManager;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dept.DEPT_MANAGER
     *
     * @param deptManager the value for dept.DEPT_MANAGER
     *
     * @mbggenerated Thu Dec 29 21:08:19 CST 2022
     */
    public void setDeptManager(Integer deptManager) {
        this.deptManager = deptManager;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dept.DEPT_VICEMANAE
     *
     * @return the value of dept.DEPT_VICEMANAE
     *
     * @mbggenerated Thu Dec 29 21:08:19 CST 2022
     */
    public Integer getDeptVicemanae() {
        return deptVicemanae;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dept.DEPT_VICEMANAE
     *
     * @param deptVicemanae the value for dept.DEPT_VICEMANAE
     *
     * @mbggenerated Thu Dec 29 21:08:19 CST 2022
     */
    public void setDeptVicemanae(Integer deptVicemanae) {
        this.deptVicemanae = deptVicemanae;
    }
}