package info.leadinglight.umljavadoclet.model;

/**
 * Generalization relationship.
 */
public class GeneralizationRel extends ModelRel {
    public GeneralizationRel(ModelClass src, ModelClass dest) {
        super(src, dest);
    }
    
    @Override
    public String getType() {
        return "extends";
    }
}
