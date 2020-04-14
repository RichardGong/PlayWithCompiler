#|
下面的代码在common lisp的SBCL实现上运行通过。

安装SBCL：
macOS上：brew install sbcl
windows平台：到sbcl.org下载

运行代码：
首先，加载meta.lsp
sbcl --load meta.lsp

进入REPL之后，可以运行：
(foo 3)
(mymax2 (list 3 4 7 5))
(mymin2 (list 6 8 3 9))

|#

(defun foo(x)
    "foo function"
    (* x 2))

(defun mymax1 (list)
  (let ((rtn (first list)))         ;让rtn等于list的第一个元素
    (do ((i 1 (1+ i)))              ;做一个循环，让i从1开始，每次加1
        ((>= i (length list)) rtn)  ;循环终止条件：i>=list的长度
      (when (> (nth i list) rtn)    ;如果list的第i个元素 > rtn
        (setf rtn (nth i list)))))) ;让rtn等于list的第i个元素

(defmacro maxmin(list pred)
  `(let ((rtn (first ,list)))
     (do ((i 1 (1+ i)))
         ((>= i (length ,list)) rtn)
       (when (,pred (nth i ,list) rtn) 
         (setf rtn (nth i ,list))))))

(defun mymax2 (list)
    (maxmin list >))

(defun mymin2 (list)
    (maxmin list <))