package my.petland.app.Messages.Notification;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAA5vKEMV0:APA91bE1f_OvQAwLcyd_Ros2uPkfEqP7uS6t-9ynEkvCOGVMOTZOnJP0odjJ0E_c-OvFGzi2wSCMrFbo5WvCzPr1v-BVVxTGE0xY7s39Iaq_NBbyt4_3M1k5LpiBHsG8LNUxm9qJdXNk"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body NotificationSender body);


}
