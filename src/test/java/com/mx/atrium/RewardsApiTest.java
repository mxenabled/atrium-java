/*
 * MX API
 * The MX Atrium API supports over 48,000 data connections to thousands of financial institutions. It provides secure access to your users' accounts and transactions with industry-leading cleansing, categorization, and classification.  Atrium is designed according to resource-oriented REST architecture and responds with JSON bodies and HTTP response codes.  Use Atrium's development environment, vestibule.mx.com, to quickly get up and running. The development environment limits are 100 users, 25 members per user, and access to the top 15 institutions. Contact MX to purchase production access. 
 *
 * OpenAPI spec version: 0.1
 * 
 */


package com.mx.atrium;

import com.mx.atrium.ApiException;
import com.mx.model.MemberResponseBody;
import com.mx.model.RewardResponseBody;
import com.mx.model.RewardsResponseBody;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RewardsApi
 */
@Ignore
public class RewardsApiTest {

    private final RewardsApi api = new RewardsApi();

    
    /**
     * Fetch rewards
     *
     * The fetch rewards endpoint begins fetching rewards for a member.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fetchRewardsTest() throws ApiException {
        String memberGuid = null;
        String userGuid = null;
        MemberResponseBody response = api.fetchRewards(memberGuid, userGuid);

        // TODO: test validations
    }
    
    /**
     * List rewards
     *
     * List rewards for a given account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listRewardsTest() throws ApiException {
        String memberGuid = null;
        String userGuid = null;
        RewardsResponseBody response = api.listRewards(memberGuid, userGuid);

        // TODO: test validations
    }
    
    /**
     * Read reward
     *
     * Read a reward.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readRewardTest() throws ApiException {
        String memberGuid = null;
        String rewardGuid = null;
        String userGuid = null;
        RewardResponseBody response = api.readReward(memberGuid, rewardGuid, userGuid);

        // TODO: test validations
    }
    
}
