/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclass;

/**
 *
 * @author Shaoun
 */
abstract class book {
    String title;

    abstract void setTitle(String s);

    String getTitle() {
        return title;
    }
}
