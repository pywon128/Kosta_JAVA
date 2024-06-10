import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        List<String> strings = List.of("I","am","a","list","of","Strings");
        Stream<String> stream = strings.stream();
        List<String> result = strings.stream().limit(4).toList();
        System.out.println(result);
//        List<String> listStream = stream.collect(Collectors.toList());
//        System.out.println(listStream);
//        System.out.println(Arrays.toString(stream.toArray()));
//        Stream<String> limit = stream.limit(4);
        List<String> sortLimitList = strings.stream().sorted().limit(4).toList();
        System.out.println(sortLimitList);

    }
}