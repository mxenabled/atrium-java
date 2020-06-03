# RewardsApi

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchRewards**](RewardsApi.md#fetchRewards) | **POST** /users/{user_guid}/members/{member_guid}/fetch_rewards | Fetch rewards
[**listRewards**](RewardsApi.md#listRewards) | **GET** /users/{user_guid}/members/{member_guid}/rewards | List rewards
[**readReward**](RewardsApi.md#readReward) | **GET** /users/{user_guid}/members/{member_guid}/rewards/{reward_guid} | Read reward


<a name="fetchRewards"></a>
# **fetchRewards**
> MemberResponseBody fetchRewards(memberGuid, userGuid)

Fetch rewards

The fetch rewards endpoint begins fetching rewards for a member.

### Example
```java
import com.mx.atrium.*;
import com.mx.model.*;

public class RewardsApiExample {
    public static void main(String[] args) {
        AtriumClient client = new AtriumClient("YOUR_API_KEY", "YOUR_CLIENT_ID", "https://vestibule.mx.com");

        String memberGuid = "MBR-123"; // String | The unique identifier for a `member`.
        String userGuid = "USR-123"; // String | The unique identifier for a `user`.

        try {
            MemberResponseBody response = client.rewards.fetchRewards(memberGuid, userGuid);
            System.out.println(response);
        } catch (ApiException e) {
            System.err.println("Exception when calling RewardsApi#fetchRewards");
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **memberGuid** | **String**| The unique identifier for a &#x60;member&#x60;. |
 **userGuid** | **String**| The unique identifier for a &#x60;user&#x60;. |

### Return type

[**MemberResponseBody**](MemberResponseBody.md)

<a name="listRewards"></a>
# **listRewards**
> RewardsResponseBody listRewards(memberGuid, userGuid)

List rewards

List rewards for a given account.

### Example
```java
import com.mx.atrium.*;
import com.mx.model.*;

public class RewardsApiExample {
    public static void main(String[] args) {
        AtriumClient client = new AtriumClient("YOUR_API_KEY", "YOUR_CLIENT_ID", "https://vestibule.mx.com");

        String memberGuid = "MBR-123"; // String | The unique identifier for a `member`.
        String userGuid = "USR-123"; // String | The unique identifier for a `user`.

        try {
            RewardsResponseBody response = client.rewards.listRewards(memberGuid, userGuid);
            System.out.println(response);
        } catch (ApiException e) {
            System.err.println("Exception when calling RewardsApi#listRewards");
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **memberGuid** | **String**| The unique identifier for a &#x60;member&#x60;. |
 **userGuid** | **String**| The unique identifier for a &#x60;user&#x60;. |

### Return type

[**RewardsResponseBody**](RewardsResponseBody.md)

<a name="readReward"></a>
# **readReward**
> RewardResponseBody readReward(memberGuid, rewardGuid, userGuid)

Read reward

Read a reward.

### Example
```java
import com.mx.atrium.*;
import com.mx.model.*;

public class RewardsApiExample {
    public static void main(String[] args) {
        AtriumClient client = new AtriumClient("YOUR_API_KEY", "YOUR_CLIENT_ID", "https://vestibule.mx.com");

        String memberGuid = "MBR-123"; // String | The unique identifier for a `member`.
        String rewardGuid = "RWD-123"; // String | The unique identifier for a `reward`.
        String userGuid = "USR-123"; // String | The unique identifier for a `user`.

        try {
            RewardResponseBody response = client.rewards.readReward(memberGuid, rewardGuid, userGuid);
            System.out.println(response);
        } catch (ApiException e) {
            System.err.println("Exception when calling RewardsApi#readReward");
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **memberGuid** | **String**| The unique identifier for a &#x60;member&#x60;. |
 **rewardGuid** | **String**| The unique identifier for a &#x60;reward&#x60;. |
 **userGuid** | **String**| The unique identifier for a &#x60;user&#x60;. |

### Return type

[**RewardResponseBody**](RewardResponseBody.md)

