/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcl.kdd.zoo;

import org.neo4j.graphdb.RelationshipType;

/**
 *
 * @author jcl
 */
public class JRelationshipType implements RelationshipType{

    public final static RelationshipType ORIGIN = RelationshipType.withName("Origem");
    private final String name;
    public JRelationshipType(String _name){
        this.name = _name;
    }
    @Override
    public String name() {
        return name;
    }

}
