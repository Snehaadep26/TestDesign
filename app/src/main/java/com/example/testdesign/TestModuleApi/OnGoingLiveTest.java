package com.example.testdesign.TestModuleApi;

import java.util.ArrayList;
import java.util.Date;

public class OnGoingLiveTest {
    public int id;
    public String title;
    public String instructions;
    public String testType;
    public String startTime;
    public String endTime;
    public Date testDate;
    public Date resultDate;
    public Date publishDate;
    public String resultTime;
    public int index;
    public int submitted;
    public String status;
    public String category;
    public int declared;
    public String syllabus;
    public Date createdAt;
    public Object deletedAt;
    public String std;
    public String section;
    public int teacherId;
    public String teacherName;
    public int authorId;
    public String authorName;
    public int testId;
    public String reviewCount;
    public String totalPoints;
    public String totalQuestions;
    public String chapterIds;
    public String chapterNames;
    public String subjectNames;
    public String subjectIds;
    public String standardIds;
    public Object chosenChapterIds;
    public Object chosenChapterNames;
    public String standardNames;
    public int missed;
    public int today;
    public int live;
    public String testProgress;
    public ArrayList<Chapter> chapters;
    public int duration;

    public OnGoingLiveTest(int id, String title, String instructions, String testType, String startTime, String endTime, Date testDate, Date resultDate, Date publishDate, String resultTime, int index, int submitted, String status, String category, int declared, String syllabus, Date createdAt, Object deletedAt, String std, String section, int teacherId, String teacherName, int authorId, String authorName, int testId, String reviewCount, String totalPoints, String totalQuestions, String chapterIds, String chapterNames, String subjectNames, String subjectIds, String standardIds, Object chosenChapterIds, Object chosenChapterNames, String standardNames, int missed, int today, int live, String testProgress, ArrayList<Chapter> chapters, int duration) {
        this.id = id;
        this.title = title;
        this.instructions = instructions;
        this.testType = testType;
        this.startTime = startTime;
        this.endTime = endTime;
        this.testDate = testDate;
        this.resultDate = resultDate;
        this.publishDate = publishDate;
        this.resultTime = resultTime;
        this.index = index;
        this.submitted = submitted;
        this.status = status;
        this.category = category;
        this.declared = declared;
        this.syllabus = syllabus;
        this.createdAt = createdAt;
        this.deletedAt = deletedAt;
        this.std = std;
        this.section = section;
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.authorId = authorId;
        this.authorName = authorName;
        this.testId = testId;
        this.reviewCount = reviewCount;
        this.totalPoints = totalPoints;
        this.totalQuestions = totalQuestions;
        this.chapterIds = chapterIds;
        this.chapterNames = chapterNames;
        this.subjectNames = subjectNames;
        this.subjectIds = subjectIds;
        this.standardIds = standardIds;
        this.chosenChapterIds = chosenChapterIds;
        this.chosenChapterNames = chosenChapterNames;
        this.standardNames = standardNames;
        this.missed = missed;
        this.today = today;
        this.live = live;
        this.testProgress = testProgress;
        this.chapters = chapters;
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getInstructions() {
        return instructions;
    }

    public String getTestType() {
        return testType;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public Date getTestDate() {
        return testDate;
    }

    public Date getResultDate() {
        return resultDate;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public String getResultTime() {
        return resultTime;
    }

    public int getIndex() {
        return index;
    }

    public int getSubmitted() {
        return submitted;
    }

    public String getStatus() {
        return status;
    }

    public String getCategory() {
        return category;
    }

    public int getDeclared() {
        return declared;
    }

    public String getSyllabus() {
        return syllabus;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Object getDeletedAt() {
        return deletedAt;
    }

    public String getStd() {
        return std;
    }

    public String getSection() {
        return section;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public int getAuthorId() {
        return authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getTestId() {
        return testId;
    }

    public String getReviewCount() {
        return reviewCount;
    }

    public String getTotalPoints() {
        return totalPoints;
    }

    public String getTotalQuestions() {
        return totalQuestions;
    }

    public String getChapterIds() {
        return chapterIds;
    }

    public String getChapterNames() {
        return chapterNames;
    }

    public String getSubjectNames() {
        return subjectNames;
    }

    public String getSubjectIds() {
        return subjectIds;
    }

    public String getStandardIds() {
        return standardIds;
    }

    public Object getChosenChapterIds() {
        return chosenChapterIds;
    }

    public Object getChosenChapterNames() {
        return chosenChapterNames;
    }

    public String getStandardNames() {
        return standardNames;
    }

    public int getMissed() {
        return missed;
    }

    public int getToday() {
        return today;
    }

    public int getLive() {
        return live;
    }

    public String getTestProgress() {
        return testProgress;
    }

    public ArrayList<Chapter> getChapters() {
        return chapters;
    }

    public int getDuration() {
        return duration;
    }
}
