public class MoodAnalyzer {

    private String msg;


    public MoodAnalyzer(){

    }
    public MoodAnalyzer(String msg) throws AnalyzerException{
        this.msg = msg;
    }

    public void analyzeMood(String msg) throws AnalyzerException{
        this.msg = msg;
        analyzeMood();
    }

    public String analyzeMood() throws AnalyzerException {
        try{
            if (msg.contains("sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (NullPointerException e) {
            throw new AnalyzerException("Enter a valid Input");
        }
    }
}