package Homework.HW_7;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LogBuilder{
        private String    statusDo;
        private NumberInt item1;
        private NumberInt item2;
        private String    doing;
        private NumberInt result;
}
