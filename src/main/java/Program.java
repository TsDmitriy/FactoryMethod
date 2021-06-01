public class Program {
    public static void main(String[] args) {
       DeveloperFactory developer = getDeveloper("python");
        developer.createDeveloper().createCode();
    }

    public static DeveloperFactory getDeveloper(String developer) {

    if (developer.equals("java")) {
        return new JavaDeveloperFactory();
    }
    else if (developer.equals("python")){
        return new PythonDeveloperFactory();
    }
    else {
        throw new  RuntimeException(developer + "нет такого разработчика");
    }
    }
}
