// ссылка на д/з : https://docs.google.com/document/d/1E_gU5MrRIwuXk_YlZK2Sw8lFuNhWHg2n6gaiRsLyym0/edit

// Задание 3.
interface Fish  { int getNumberOfScales(); }
interface Piano { int getNumberOfScales(); } // int вместо double
class Tuna implements Fish, Piano {
    public int getNumberOfScales() { return 91; }
}