package izly;

import secretCode.CodeSecret;

public class Purse {

    private Purse() {
    }

    public static Purse createPurse(double plafond, int nbOperationMax, CodeSecret codeSecret) throws CreationPurseException {
        return null;
    }

    public double getSolde() {
        return 0;
    }

    public void debite(double montant, String codeProposé) throws RejetTransactionException {
    }

    public void credite(double montant) throws RejetTransactionException {
    }

}
