package liu.bean;

public class Job {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column job.JOB_ID
     *
     * @mbggenerated Thu Dec 29 21:08:19 CST 2022
     */
    private Integer jobId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column job.JOB_NAME
     *
     * @mbggenerated Thu Dec 29 21:08:19 CST 2022
     */
    private String jobName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column job.JOB_ID
     *
     * @return the value of job.JOB_ID
     *
     * @mbggenerated Thu Dec 29 21:08:19 CST 2022
     */
    public Integer getJobId() {
        return jobId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column job.JOB_ID
     *
     * @param jobId the value for job.JOB_ID
     *
     * @mbggenerated Thu Dec 29 21:08:19 CST 2022
     */
    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column job.JOB_NAME
     *
     * @return the value of job.JOB_NAME
     *
     * @mbggenerated Thu Dec 29 21:08:19 CST 2022
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column job.JOB_NAME
     *
     * @param jobName the value for job.JOB_NAME
     *
     * @mbggenerated Thu Dec 29 21:08:19 CST 2022
     */
    public void setJobName(String jobName) {
        this.jobName = jobName == null ? null : jobName.trim();
    }
}