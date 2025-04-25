package fr.neamar.kiss.pojo;

public class FolderPojo extends Pojo {
    public String name;

    public FolderPojo(String name) {
        this.name = name;
        this.id = "folder_" + name.toLowerCase();
        this.type = Pojo.FOLDER;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }
}
