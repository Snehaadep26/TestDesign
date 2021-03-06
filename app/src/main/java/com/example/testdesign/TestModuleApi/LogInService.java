package com.example.testdesign.TestModuleApi;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface LogInService {
    String token = "Authorization:Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6ODkwLCJwaG9uZSI6Iis5MTc4OTU0MTM2NTkiLCJ1cmwiOiJ0ZXN0LnRoZWNsYXNzcm9vbS5iaXoiLCJvcmdJZCI6IjRjYjI1MDlkLTcwZjUtNDM1ZS04NzkyLWQyNDkzNzc0M2I1MyIsImRldmljZUxvZ2luQ29kZSI6bnVsbCwiYnJvd3NlckxvZ2luQ29kZSI6Iis5MTc4OTU0MTM2NTk4OTBiYWU2MjI3NS1jYjA3LTQ4MzAtYjFhOS02MTk1YzFmZDgxY2QiLCJpYXQiOjE2NTA4OTIxMzV9.3d4km7gXCWMexzSg79B-EtfPSdKCLAUU1B8BwK9hnsQ";
    String link = "orgurl:test.theclassroom.biz";

    @Headers({token, link})
    @GET("testv2/get/all-tests-for-student")
    Call<GetAllTestForStudentResponse> getAllTestStudCall();

    @Headers({token, link})
    @GET("testv2/student/syllabus-tests")
    Call<GetSyllabuswiseTestResponse> getSyllabusTestCall(@Query("syllabus") String syllabus);

    @Headers({token, link})
    @GET("testv2/student/chapter-test-chapters")
    Call<List<GetChapterTestResponse>> getChapterTestCall(@Query("subjectId") int subjectId);

    @Headers({token, link})
    @GET("testv2/get/subwise-tests-for-student")
    Call<GetTestByTestResponse> getTestByTestCall(@Query("status") String status,@Query("syllabus") String syllabus,@Query("combined") boolean combined,@Query("page") int page);

    @Headers({token, link})
    @GET("test/get/questions-by-test/714")
    Call<FetchQuestionByTestResponse> fetchTestByQueCall(@Query("index") int index);

    @Headers({token, link})
    @GET("testv2/student-solution/")
    Call<GetStudentSolutionResponse> studSolutionCall(@Query("testId") int testId,@Query("page") int page);

}
