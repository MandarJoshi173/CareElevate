/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spr.beans;

/**
 *
 * @author hp
 */
public class FeedbackTable {
    private int feedbackId;
    private String userId;
    private String feedbackType;
    private String feedback;

    public FeedbackTable() {
    }

    public FeedbackTable(int feedbackId, String userId, String feedbackType, String feedback) {
        this.feedbackId = feedbackId;
        this.userId = userId;
        this.feedbackType = feedbackType;
        this.feedback = feedback;
    }

    public int getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(int feedbackId) {
        this.feedbackId = feedbackId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFeedbackType() {
        return feedbackType;
    }

    public void setFeedbackType(String feedbackType) {
        this.feedbackType = feedbackType;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
    
    
}
