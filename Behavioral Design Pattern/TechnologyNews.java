package bd.pattern;

public class TechnologyNews extends News {
    TechnologyNews(String content) {super(content);}

    @Override
    public NewsTopic getTopic() {
        return NewsTopic.TECHNOLOGY;
    }
}
