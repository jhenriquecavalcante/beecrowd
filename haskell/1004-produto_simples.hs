main :: IO ()
main = do
  a <- getLine
  b <- getLine
  let prod = read a * read b :: Int
  putStrLn $ "PROD = " ++ show prod
