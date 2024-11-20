package type;

public class StringType {

    public static void main(String[] args) {
        Person person = new Person("김영재", 25);
        String log = String.format("이름: %s, 나이: %d", person.getName(), person.getAge());

        StringBuilder sb = new StringBuilder();
        sb.append("이름: ");
        sb.append(person.getName());
        sb.append(System.lineSeparator());
        sb.append("나이: ");
        sb.append(person.getAge());
        System.out.println(sb);

        String str = "ABC";
        System.out.println(str.charAt(0));
    }

}
