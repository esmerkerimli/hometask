import java.util.Arrays;
import java.util.Objects;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private int size;
    private Pet pet;

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.children = new Human[0];
        this.size = 0;
        mother.setFamily(this);
        father.setFamily(this);
    }

    public void addChild(Human child) {
        Human[] newChildren = Arrays.copyOf(children, size + 1); // Create a new array with size + 1
        newChildren[size] = child;
        children = newChildren;
        size++;
        child.setFamily(this);
    }

    public boolean deleteChild(Human child) {
        for (int i = 0; i < size; i++) {
            if (children[i].equals(child)) {
                Human[] newChildren = new Human[size - 1];
                System.arraycopy(children, 0, newChildren, 0, i); // Copy up to the child
                System.arraycopy(children, i + 1, newChildren, i, size - i - 1); // Copy after the child
                children = newChildren;
                size--;
                return true;
            }
        }
        return false;
    }

    public boolean deleteChild(int index) {
        if (index >= 0 && index < size) {
            Human[] newChildren = new Human[size - 1];
            System.arraycopy(children, 0, newChildren, 0, index); // Copy up to the index
            System.arraycopy(children, index + 1, newChildren, index, size - index - 1); // Copy after the index
            children = newChildren;
            size--;
            return true;
        }
        return false;
    }

    public int countFamily() {
        return 2 + size;
    }

    @Override
    public String toString() {
        return "Family{"+"mother=" + mother.getName()+", father=" + father.getName()+", children=" + Arrays.toString(children)+", pet="+(pet!=null?pet.toString():"No pet")+'}';
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
        this.size = children.length;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    protected void finalize() throws Throwable {
        throw new UnsupportedOperationException("Finalize not supported.");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Family family = (Family) obj;
        return Objects.equals(mother, family.mother) &&
                Objects.equals(father, family.father) &&
                Arrays.equals(children, family.children) &&
                Objects.equals(pet, family.pet);
    }


    @Override
    public int hashCode() {
        int result = Objects.hash(mother, father, pet);
        result = 31 * result + Arrays.hashCode(children);
        return result;
    }
}
