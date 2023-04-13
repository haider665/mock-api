package com.withinks.mockapi.dto;

import java.util.Date;

/**
 * @author mofizhaider
 * @since 4/13/23
 */
public record AccessInformation(long withingsUserId,
                                long provId,
                                long indivId,
                                String accessToken,
                                Date updateDate,
                                String refreshToken,
                                int expiresIn){

}
