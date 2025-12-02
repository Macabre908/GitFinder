class Badge {
    public String print(Integer id, String name, String department) {
        if (id == null && department == null) {
            return String.format("%s - %s", name, "OWNER");
        }
        if (id == null) {
            return String.format("%s - %s", name, department.toUpperCase());
        }
        if (department == null) {
            return String.format("[%d] - %s - %s", id, name, "OWNER");
        }
        return String.format("[%d] - %s - %s", id, name, department.toUpperCase());
    }
}
