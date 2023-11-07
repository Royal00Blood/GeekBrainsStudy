package hw2_Algoritm;

public class RBTree<T extends Comparable<T>> {
    private RBNode <T> root; // корневой узел
    private static final boolean RED = false; // Определяем логотип красного и черного дерева
    private static final boolean BLACK = true;

    // Внутренний класс: класс узла
    public class RBNode<T extends Comparable<T>>{
        boolean color; // цвет
        T key; // Ключевое слово (значение ключа)
        RBNode <T> left; // Левый дочерний узел
        RBNode <T> right; // Правый дочерний узел
        RBNode <T> parent; // Родительский узел

        public RBNode(T key, boolean color, RBNode<T> parent, RBNode<T> left, RBNode<T> right) {
            this.key = key;
            this.color = color;
            this.parent = parent;
            this.left = left;
            this.right = right;
        }

        public T getKey() {
            return key;
        }

        public String toString() {
            return "" + key + (this.color == RED? "R" : "B");
        }
    }

    public RBTree() {
        root = null;
    }

    public RBNode <T> parentOf (RBNode <T> node) {// Получить родительский узел
        return node != null? node.parent : null;
    }

    public void setParent (RBNode <T> node, RBNode <T> parent) {// Устанавливаем родительский узел
        if(node != null)
            node.parent = parent;
    }

    public boolean colorOf (RBNode <T> node) {// Получаем цвет узла
        return node != null? node.color : BLACK;
    }

    public boolean isRed (RBNode <T> node) {// Оценка цвета узла
        return (node != null)&&(node.color == RED)? true : false;
    }

    public boolean isBlack(RBNode<T> node) {
        return !isRed(node);
    }

    public void setRed (RBNode <T> node) {// Устанавливаем цвет узла
        if(node != null)
            node.color = RED;
    }

    public void setBlack(RBNode<T> node) {
        if(node != null) {
            node.color = BLACK;
        }
    }

    public void setColor(RBNode<T> node, boolean color) {
        if(node != null)
            node.color = color;
    }


    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(RBNode<T> tree) {
        if(tree != null) {
            System.out.print(tree.key + " ");
            preOrder(tree.left);
            preOrder(tree.right);
        }
    }


    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(RBNode<T> tree) {
        if(tree != null) {
            preOrder(tree.left);
            System.out.print(tree.key + " ");
            preOrder(tree.right);
        }
    }

    public void postOrder() {
        postOrder(root);
    }

    private void postOrder(RBNode<T> tree) {
        if(tree != null) {
            preOrder(tree.left);
            preOrder(tree.right);
            System.out.print(tree.key + " ");
        }
    }


    public RBNode<T> search(T key) {
        return search(root, key);
        // возвращаем search2 (root, key); // Используем рекурсивный метод, суть та же
    }

    private RBNode<T> search(RBNode<T> x, T key) {
        while(x != null) {
            int cmp = key.compareTo(x.key);
            if(cmp < 0)
                x = x.left;
            else if(cmp > 0)
                x = x.right;
            else
                return x;
        }
        return x;
    }
    // Используем рекурсию
    private RBNode<T> search2(RBNode<T> x, T key) {
        if(x == null)
            return x;
        int cmp = key.compareTo(x.key);
        if(cmp < 0)
            return search2(x.left, key);
        else if(cmp > 0)
            return search2(x.right, key);
        else
            return x;
    }


    public T minValue() {
        RBNode<T> node = minNode(root);
        if(node != null)
            return node.key;
        return null;
    }

    private RBNode<T> minNode(RBNode<T> tree) {
        if(tree == null)
            return null;
        while(tree.left != null) {
            tree = tree.left;
        }
        return tree;
    }


    public T maxValue() {
        RBNode<T> node = maxNode(root);
        if(node != null)
            return node.key;
        return null;
    }

    private RBNode<T> maxNode(RBNode<T> tree) {
        if(tree == null)
            return null;
        while(tree.right != null)
            tree = tree.right;
        return tree;
    }


    public RBNode<T> successor(RBNode<T> x) {
        // Если у x есть правый дочерний узел, то последующий узел является «наименьшим узлом поддерева с корнем в правом дочернем узле»
        if(x.right != null)
            return minNode(x.right);
        // Если у x нет правого дочернего узла, возникнут следующие две ситуации:
        // 1. x является левым дочерним узлом своего родительского узла, тогда узел-преемник x является его родительским узлом
        // 2. x является правым дочерним узлом своего родительского узла, сначала найдите родительский узел p для x, а затем снова оцените p для этих двух условий
        RBNode<T> p = x.parent;
        while ((p != null) && (x == p.right)) {// Соответствующий случай 2
            x = p;
            p = x.parent;
        }
        return p; // Соответствующая ситуация 1

    }


    public RBNode<T> predecessor(RBNode<T> x) {
        // Если у x есть левый дочерний узел, то предшествующий узел является «самым большим узлом поддерева с корнем в левом дочернем узле»
        if(x.left != null)
            return maxNode(x.left);
        // Если у x нет левого дочернего узла, возникнут следующие две ситуации:
        // 1. x является правым дочерним узлом своего родительского узла, тогда узел-предшественник x является его родительским узлом
        // 2. x - левый дочерний узел своего родительского узла, сначала найдите родительский узел p для x, а затем снова оцените p для этих двух условий
        RBNode<T> p = x.parent;
        while ((p != null) && (x == p.left)) {// Соответствующий случай 2
            x = p;
            p = x.parent;
        }
        return p; // Соответствующая ситуация 1
    }


    private void leftRotate(RBNode<T> x) {
        // 1. Назначьте левый дочерний узел y правому дочернему узлу x и назначьте x родительскому узлу левого дочернего узла y (когда левый дочерний узел y не пуст)
        RBNode<T> y = x.right;
        x.right = y.left;

        if(y.left != null)
            y.left.parent = x;

        // 2. Назначьте родительский узел p элемента x (если он не пустой) родительскому узлу y и обновите дочерний узел p до y (слева или справа)
        y.parent = x.parent;

        if(x.parent == null) {
            this.root = y; // Если родительский узел x пуст, установите y как родительский узел
        } else {
            if (x == x.parent.left) // Если x левый дочерний узел
                x.parent.left = y; // Затем также устанавливаем y как левый дочерний узел
            else
                x.parent.right = y; // в противном случае установите y как правый дочерний узел
        }

        // 3. Установите левый дочерний узел y на x, а родительский узел x на y
        y.left = x;
        x.parent = y;
    }


    private void rightRotate(RBNode<T> y) {
        // 1. Назначьте левый дочерний узел y правому дочернему узлу x и назначьте x родительскому узлу левого дочернего узла y (когда левый дочерний узел y не пуст)
        RBNode<T> x = y.left;
        y.left = x.right;

        if(x.right != null)
            x.right.parent = y;

        // 2. Назначьте родительский узел p элемента x (если он не пуст) родительскому узлу y и обновите дочерний узел p до y (слева или справа)
        x.parent = y.parent;

        if(y.parent == null) {
            this.root = x; // Если родительский узел x пуст, установите y как родительский узел
        } else {
            if (y == y.parent.right) // Если x левый дочерний узел
                y.parent.right = x; // Затем также установите y как левый дочерний узел
            else
                y.parent.left = x; // в противном случае установите y как правый дочерний узел
        }

        // 3. Установите левый дочерний узел y на x, а родительский узел x на y
        x.right = y;
        y.parent = x;
    }


    public void insert(T key) {
        RBNode<T> node = new RBNode<T>(key, RED, null, null, null);
        if(node != null)
            insert(node);
    }

    // Вставляем узел в красно-черное дерево, этот процесс аналогичен бинарному дереву поиска
    private void insert(RBNode<T> node) {
        RBNode <T> current = null; // Указывает родительский узел последнего узла
        RBNode <T> x = this.root; // Используется для поиска вниз

        // 1. Находим вставленную позицию
        while(x != null) {
            current = x;
            int cmp = node.key.compareTo(x.key);
            if(cmp < 0)
                x = x.left;
            else
                x = x.right;
        }
        node.parent = current; // Местоположение найдено, и текущий текущий используется как родительский узел узла

        // 2. Затем определите, вставлен ли узел в левый дочерний узел или в правый дочерний узел.
        if(current != null) {
            int cmp = node.key.compareTo(current.key);
            if(cmp < 0)
                current.left = node;
            else
                current.right = node;
        } else {
            this.root = node;
        }

        // 3. Измените его в красно-черное дерево
        insertFixUp(node);
    }

    private void insertFixUp(RBNode<T> node) {
        RBNode <T> parent, gparent; // определяем родительский узел и прародительский узел

        // Условие, которое необходимо обрезать: родительский узел существует, и цвет родительского узла красный
        while(((parent = parentOf(node)) != null) && isRed(parent)) {
            gparent = parentOf (parent); // Получаем дедушку и дедушку

            // Если родительский узел является левым дочерним узлом дедушкиного узла, следующее else является противоположным
            if(parent == gparent.left) {
                RBNode <T> uncle = gparent.right; // Получить узел дяди

                // case1: узел дяди тоже красный
                if(uncle != null && isRed(uncle)) {
                    setBlack (parent); // Очернить родительский узел и дядя узел
                    setBlack(uncle);
                    setRed (gparent); // Закрашиваем дедушку в красный цвет
                    node = gparent; // Помещаем позицию на дедушку узла
                    continue; // Продолжить пока, пересмотреть
                }

                // case2: узел-дядя черный, а текущий узел - правый дочерний узел
                if(node == parent.right) {
                    leftRotate (parent); // Повернуть влево от родительского узла
                    RBNode <T> tmp = parent; // Затем меняем местами родительский узел и себя, чтобы подготовиться к следующему правому вращению
                    parent = node;
                    node = tmp;
                }

                // case3: узел-дядя черный, а текущий узел - левый дочерний узел
                setBlack(parent);
                setRed(gparent);
                rightRotate(gparent);
            } else {// Если родительский узел является правым дочерним узлом дедушкиного узла, он полностью противоположен приведенному выше, суть такая же
                RBNode<T> uncle = gparent.left;

                // case1: узел дяди тоже красный
                if(uncle != null & isRed(uncle)) {
                    setBlack(parent);
                    setBlack(uncle);
                    setRed(gparent);
                    node = gparent;
                    continue;
                }

                // case2: узел-дядя черный, а текущий узел - левый дочерний узел
                if(node == parent.left) {
                    rightRotate(parent);
                    RBNode<T> tmp = parent;
                    parent = node;
                    node = tmp;
                }

                // case3: узел-дядя черный, а текущий узел - правый дочерний узел
                setBlack(parent);
                setRed(gparent);
                leftRotate(gparent);
            }
        }

        // Устанавливаем корневой узел в черный цвет
        setBlack(this.root);
    }
}




