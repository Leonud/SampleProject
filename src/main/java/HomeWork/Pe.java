package HomeWork;

public class Pe {
    public static void printTextPerRole(String[] role, String[] textLines) {
        for (int i = 0; i < role.length ; i++) {
            System.out.println('\n' + role[i]);
            for (int j = 0; j < textLines.length; j++) {
                if(textLines[j].startsWith(role[i])) {
                    System.out.println( j  + 1 + ")" + textLines[j].replaceAll(role[i] + ':', ""));
                }
            }
        }
    }
    public static void main(String[] args) {
        // Герои
        String[] Role = {"Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич"};

        //Реплики героев
        String[] textRole = {"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};
        printTextPerRole(Role, textRole);
    }

}