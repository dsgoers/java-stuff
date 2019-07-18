package pig.roge;

public final class LineBreakToCommaConverter {
    private static final String LINE_BREAK_DELIMITED_LIST = "Java\n"
            + "J2EE\n"
            + "Maven\n"
            + "Wildfly AS\n"
            + "Hibernate ORM\n"
            + "JPA\n"
            + "REST\n"
            + "SQL\n"
            + "PostgreSQL\n"
            + "MySQL\n"
            + "Ruby\n"
            + "Rails\n"
            + "JavaScript\n"
            + "React Native\n"
            + "GraphQL\n"
            + "Apollo GraphQL client\n"
            + "JSON:API\n"
            + "Travis CI\n"
            + "ECS\n"
            + "S3\n"
            + "SNS\n"
            + "GitHub\n"
            + "Jenkins\n"
            + "IntelliJ\n"
            + "RubyMine";

    private final String list;

    public LineBreakToCommaConverter(final String newList) {
        this.list = newList;
    }

    public String execute() {
        return list.replace("\n", ", ");
    }

    public static void main(final String[] args) {
        System.out.println(
                new LineBreakToCommaConverter(LINE_BREAK_DELIMITED_LIST)
                        .execute()
        );
    }
}
