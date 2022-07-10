// 롬복이 잘 작동하는지 (@Getter 잘 작동하는지) 확인하는 테스트코드 입니다.
package com.jojoldu.book.springboot.web.dto;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {
    @Test
    public void 롬복_기능_테스트(){
        //given
        String name="test";
        int amount=1000;
        //when
        HelloResponseDto dto=new HelloResponseDto(name,amount);

        //then
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }

}