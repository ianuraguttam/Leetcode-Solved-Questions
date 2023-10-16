class Solution {
public:
    Node* cloneGraph(Node* node) {
        if (node == nullptr) {
            return nullptr;
        }
        unordered_map<Node*, Node*> nodeMap;
        return clone(node, nodeMap);
    }
    
    Node* clone(Node* node, unordered_map<Node*, Node*>& nodeMap) {
        if (node == nullptr) {
            return nullptr;
        }
        if (nodeMap.count(node) > 0) {
            return nodeMap[node];
        }
        Node* cloneNode = new Node(node->val);
        nodeMap[node] = cloneNode;
        for (Node* neighbor : node->neighbors) {
            cloneNode->neighbors.push_back(clone(neighbor, nodeMap));
        }
        return cloneNode;
    }
};