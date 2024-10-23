

public class FreeResponse

   public FreeResponse(String questionText)
   {
      setText(questionText);
   }
   
   @Override
   public boolean checkAnswer(String response)
   {
      setAnswer(response);
      return true;
   }
   
   
}

