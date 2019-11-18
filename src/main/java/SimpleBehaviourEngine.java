
import behaviours.Behaviour;

import java.lang.reflect.*;
import java.util.function.Supplier;

/* Created by JavaUnifiedTester   hasanaligul  2019-11-13  */
public class SimpleBehaviourEngine{


    public static  void Execute(Type [] pageBehaviours) throws ClassNotFoundException,
            IllegalAccessException, InstantiationException {

        for (Type pageBehaviour: pageBehaviours) {


            Behaviour currentBehaviour= (Behaviour) Class.forName(pageBehaviour.getTypeName()).newInstance();
            currentBehaviour.performPreActAsserts();
            currentBehaviour.performAct();
            currentBehaviour.performPostActAsserts();
            currentBehaviour.performPostAct();


        }
    }




}
