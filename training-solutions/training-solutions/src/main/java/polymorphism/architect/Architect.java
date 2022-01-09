package polymorphism.architect;

public class Architect {

    public static void main(String[] args) {
        int pages = 10;
        String title = "Building";
        String name = "John Doe";
        String address = "123 Main Street, 10101 London";
        int drawings = 5;

        Plan planSketch = new SketchPlan(pages, title);
        Plan planPermit = new PermitPlan(pages, title, name, address);
        Plan planConstruction = new ConstructionPlan(pages, title, name, address, drawings);

        SketchPlan sketchPlanSketch = new SketchPlan(pages, title);
        SketchPlan sketchPlanPermit = new PermitPlan(pages, title, name, address);
        SketchPlan sketchPlanConstruction = new ConstructionPlan(pages, title, name, address, drawings);

        Header headerPermit = new PermitPlan(pages, title, name, address);
        Header headerConstruction = new ConstructionPlan(pages, title, name, address, drawings);

        PermitPlan permitPlanPermit = new PermitPlan(pages, title, name, address);
        PermitPlan permitPlanConstruction = new ConstructionPlan(pages, title, name, address, drawings);

        ConstructionPlan constructionPlanConstruction = new ConstructionPlan(pages, title, name, address, drawings);

        System.out.println(planSketch.getPagesOfDocumentation());
        System.out.println(planPermit.getPagesOfDocumentation());
        System.out.println(planConstruction.getPagesOfDocumentation());
        System.out.println();

        System.out.println(sketchPlanSketch.getPagesOfDocumentation());
        System.out.println(sketchPlanSketch.getTitle());
        System.out.println(sketchPlanPermit.getPagesOfDocumentation());
        System.out.println(sketchPlanPermit.getTitle());
        System.out.println(sketchPlanConstruction.getPagesOfDocumentation());
        System.out.println(sketchPlanConstruction.getTitle());
        System.out.println();

        System.out.println(headerPermit.getNameOfClient());
        System.out.println(headerPermit.getAddressOfBuilding());
        System.out.println(headerConstruction.getNameOfClient());
        System.out.println(headerConstruction.getAddressOfBuilding());
        System.out.println();

        System.out.println(permitPlanPermit.getPagesOfDocumentation());
        System.out.println(permitPlanPermit.getTitle());
        System.out.println(permitPlanPermit.getNameOfClient());
        System.out.println(permitPlanPermit.getAddressOfBuilding());
        System.out.println(permitPlanPermit.getHeader());
        System.out.println(permitPlanConstruction.getPagesOfDocumentation());
        System.out.println(permitPlanConstruction.getTitle());
        System.out.println(permitPlanConstruction.getNameOfClient());
        System.out.println(permitPlanConstruction.getAddressOfBuilding());
        System.out.println(permitPlanConstruction.getHeader());
        System.out.println();

        System.out.println(constructionPlanConstruction.getPagesOfDocumentation());
        System.out.println(constructionPlanConstruction.getTitle());
        System.out.println(constructionPlanConstruction.getNameOfClient());
        System.out.println(constructionPlanConstruction.getAddressOfBuilding());
        System.out.println(constructionPlanConstruction.getSheetsOfConstructionDrawings());
        System.out.println(constructionPlanConstruction.getHeader());
    }
}