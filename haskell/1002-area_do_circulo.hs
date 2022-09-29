import Text.Printf (printf)

pi' = 3.14159 :: Double

main :: IO ()
main = do
  raio <- getLine
  let area = pi' * read raio * read raio :: Double
  putStrLn $ "A=" ++ printf "%.4f" area
