/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.adventureGame.model;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author vladbalashov
 */
public class PartyComposition implements Serializable{
    
    private String CharacterName;

    public PartyComposition() {
    }
    
    

    public String getCharacterName() {
        return CharacterName;
    }

    public void setCharacterName(String CharacterName) {
        this.CharacterName = CharacterName;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.CharacterName);
        return hash;
    }

    @Override
    public String toString() {
        return "PartyComposition{" + "CharacterName=" + CharacterName + '}';
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PartyComposition other = (PartyComposition) obj;
        if (!Objects.equals(this.CharacterName, other.CharacterName)) {
            return false;
        }
        return true;
    }
    
    
    
}
