/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.model;

import javax.ejb.Stateless;

/**
 *
 * @author hp
 */
@Stateless
public class TestManagerSB implements TestManagerSBLocal {

    @Override
    public Integer generateRandomNumber() {
        int randNum;
        
        randNum = 1 + (int)Math.floor(Math.random()*10);
        
        return randNum;
    }

    @Override
    public String generateQuestion(Character code, Integer num1, Integer num2) {
        String question;
        
        if(code.equals('a')){
            question = num1 + " + " + num2 + " = ?";
        }else {
            question = num1 + " + " + num2 + " = ?";
        }
        
        return question;
    }

    @Override
    public Integer determineAnswer(Character code, Integer num1, Integer num2) {
        Integer answer;
        
        if(code.equals('a')){
            answer = num1 + num2;
        }else {
            answer = num1 + num2;
        }
        
        return answer;
    }

    @Override
    public Boolean isAnswerCorrect(Integer userAnswer, Integer correctAnswer) {
       boolean isCorrect = false;
        
       if(userAnswer.equals(correctAnswer)){
            isCorrect = true;
       }
       
        return isCorrect;
    }

    @Override
    public String determineOutcome(Boolean isCorrect) {
        String outcome = "Wrong answer!";
        
        if(isCorrect){
            outcome = "Correct answer";
        }
        
        return outcome;
    }
    
    
}
