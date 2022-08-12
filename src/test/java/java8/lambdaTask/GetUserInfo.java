package java8.lambdaTask;

public interface GetUserInfo {

    String userInfo(int age, String name, double weight);

    static GetUserInfo info() {
        return ((age, name, weight) ->
                String.format("User name: %s,\nAge: %d,\nWeight: %.1f", name, age, weight));
    }
}
