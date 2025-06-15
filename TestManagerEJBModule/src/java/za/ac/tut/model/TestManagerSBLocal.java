/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.model;

import javax.ejb.Local;

/**
 *
 * @author hp
 */
@Local
public interface TestManagerSBLocal {

    Integer generateRandomNumber();

    String generateQuestion(Character code, Integer num1, Integer mum2);

    Integer determineAnswer(Character code, Integer num1, Integer num2);

    Boolean isAnswerCorrect(Integer userAnswer, Integer correctAnswer);

    String determineOutcome(Boolean isCorrect);
    
}
