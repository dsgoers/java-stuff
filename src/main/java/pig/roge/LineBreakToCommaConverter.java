package pig.roge;

public class LineBreakToCommaConverter {
    private static final String lineBreakDelimitedList = "Java\n" +
            "J2EE\n" +
            "Maven\n" +
            "Wildfly AS\n" +
            "Hibernate ORM\n" +
            "JPA\n" +
            "REST\n" +
            "SQL\n" +
            "PostgreSQL\n" +
            "MySQL\n" +
            "Ruby\n" +
            "Rails\n" +
            "JavaScript\n" +
            "React Native\n" +
            "GraphQL\n" +
            "Apollo GraphQL client\n" +
            "JSON:API\n" +
            "Travis CI\n" +
            "ECS\n" +
            "S3\n" +
            "SNS\n" +
            "GitHub\n" +
            "Jenkins\n" +
            "IntelliJ\n" +
            "RubyMine";

    private String execute() {
        return lineBreakDelimitedList.replace("\n", ", ");
    }

    public static void main(String [] args) {
        System.out.println(new LineBreakToCommaConverter().execute());
    }
}
