package core.app9;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Component
public class Comp1 {
    private Comp2 comp2;

    public Comp1() {
    } //생성자 여러개 가질 수 있음

    //생성자 주입
    //이 어노테이션이 없으면 위 빈 Com1이 우선.
    //생성자가 하나밖에 없다면 @Autowired 이어도 선택권 없이 이 생성자
    @Autowired
    public Comp1(Comp2 comp2) {
        this.comp2 = comp2;
    }
}
