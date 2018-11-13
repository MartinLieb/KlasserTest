public class Main {

    public static void main(String[] args) {

        Silverware s = new Silverware(5,"metal",true,true,5.5);
        System.out.println(s.isUsesPower());

        KitchenUtensils blender = new KitchenUtensils(1, "metal",true,false,10);
        System.out.println(blender.getMateriale());
        System.out.println(blender.getLenght());
        blender.addLenght();
        System.out.println(blender.getLenght());
        System.out.println(blender.getMateriale());
        blender.materialeToWood();
        System.out.println(blender.getMateriale());
        blender.useUtensils();

        KitchenUtensils kitchenAid = new KitchenUtensils("metal", true);
        System.out.println(kitchenAid.isUsesPower());

        KitchenUtensils cuttingBoard = new KitchenUtensils("wood", false);
        System.out.println(cuttingBoard.isUsesPower());
        cuttingBoard.electrify();
        System.out.println(cuttingBoard.isUsesPower());
    }
}
