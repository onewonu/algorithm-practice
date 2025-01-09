## 간단한 식 계산하기

### 문제 설명
문자열 `binomial`이 매개변수로 주어집니다. `binomial`은 `"a op b"` 형태의 이항식이고 `a`와 `b`는 음이 아닌 정수, `op`는 `'+'`, `'-'`, `'*'` 중 하나입니다. 주어진 식을 계산한 정수를 return 하는 `solution` 함수를 작성해 주세요.

---

### 제한사항
- $0 \leq a, b \leq 40,000$
- 0을 제외하고 `a`, `b`는 0으로 시작하지 않습니다.

---

### 입출력 예

| binomial          | result       |
|-------------------|--------------|
| `"43 + 12"`       | `55`         |
| `"0 - 7777"`      | `-7777`      |
| `"40000 * 40000"` | `1600000000` |

---

### 입출력 예 설명

#### 예제 #1
- `binomial`이 `"43 + 12"`이므로, 이 식을 계산한 결과는 `43 + 12 = 55`입니다.
- 따라서 `55`를 return 합니다.

#### 예제 #2
- `binomial`이 `"0 - 7777"`이므로, 이 식을 계산한 결과는 `0 - 7777 = -7777`입니다.
- 따라서 `-7777`을 return 합니다.

#### 예제 #3
- `binomial`이 `"40000 * 40000"`이므로, 이 식을 계산한 결과는 `40000 × 40000 = 1600000000`입니다.
- 따라서 `1600000000`을 return 합니다.
# 회고
### 다른 풀이 방법: BiFunction
```java
 private static Map<String, BiFunction<Integer, Integer, Integer>> getStringBiFunctionMap() {
    return Map.of(
            "+", (x, y) -> x + y,
            "-", (x, y) -> x - y,
            "*", (x, y) -> x * y
    );
}

public int solution(String binomial) {
    String[] split = binomial.split(" ");
    int a = Integer.parseInt(split[0]);
    String op = split[1];
    int b = Integer.parseInt(split[2]);

    return getStringBiFunctionMap().get(op).apply(a, b);
}
```
>  Java 8에서 도입된 Functional Interface 로, 두 개의 입력값을 받아서 하나의 출력값을 생성하는 함수형 인터페이스. 주로 람다식 또는 메서드 참조와 함께 사용되며, java.util.function 패키지에 포함.
- 예제 
```java
public void test() {
    BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
    System.out.println(add.apply(3, 5)); // 출력: 8

    BiFunction<String, String, String> concat = String::concat;
    System.out.println(concat.apply("Hello, ", "World!")); // 출력: Hello, World!

    BiFunction<Integer, Integer, String> compare = (a, b) -> a > b ? "Greater" : "Lesser or Equal";
    System.out.println(compare.apply(10, 5)); // 출력: Greater
}
```
### 다른 풀이 방법: Enum
```java
public enum Operator {
    PLUS("+") {
        public int apply(int x, int y) {
            return x + y;
        }
    },
    MINUS("-") {
        public int apply(int x, int y) {
            return x - y;
        }
    },
    MULTIPLY("*") {
        public int apply(int x, int y) {
            return x * y;
        }
    };

    private final String symbol;

    Operator(String symbol) {
        this.symbol = symbol;
    }

    public abstract int apply(int x, int y);

    public static Operator fromSymbol(String symbol) {
        for (Operator op : values()) {
            if (op.symbol.equals(symbol)) return op;
        }
        throw new IllegalArgumentException("Unsupported operator: " + symbol);
    }
}

public int solution(String binomial) {
    String[] parts = binomial.split(" ");
    int a = Integer.parseInt(parts[0]);
    String op = parts[1];
    int b = Integer.parseInt(parts[2]);

    return Operator.fromSymbol(op).apply(a, b);
}
```
